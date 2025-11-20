package com.xzero.core.ui.widget.listview;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AbsListView;
import android.widget.AbsListView.OnScrollListener;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import com.xzero.core.ui.R;


/**
 * 滚动到底部加载更多的listView
 */
public class AddMoreListView extends ListView implements OnScrollListener {

    /**
     * 滚动到底部回掉接口
     */
    public interface OnBottomListener {

        /**
         * 加载更多
         */
        public void loadMore();
    }

    //footer XML布局
    private View footerView;
    private ImageView footerImg;
    private TextView footerText;
    private int firstItemIndex;
    private int currentScrollState;
    private OnBottomListener onBottomListener;
    private View placeholder_listView_headerView;

    /**
     * 每页总数
     */
    private int pageSize = 8;
    /**
     * 满足查询条件的总数
     */
    private long total = 0;

    public AddMoreListView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public AddMoreListView(Context context, AttributeSet attrs, int defStyle) {
        super(context, attrs, defStyle);
        init(context);
    }

    /**
     * 初始化
     */
    private void init(Context context) {
        // footerView
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        footerView = inflater.inflate(R.layout.add_more_list_view_footer, null);
        footerImg = (ImageView) footerView.findViewById(R.id.loadMoreImg);
        footerText = (TextView) footerView.findViewById(R.id.loadMoreHintTv);
        footerView.setTag(true);

        //占位，让可以在setAdapter之后调用addFooterView有效果
        placeholder_listView_headerView = inflater.inflate(R.layout.placeholder_listview_headerview, null);
        addFooterView(placeholder_listView_headerView, null, false);

        setOnScrollListener(this);
    }

    /**
     * 对比每页总数和满足条件的所有条数。应该在onScrollStateChanged设置，
     * 当total > pageSize时滚动条触底才能出现加载更多的footerView。
     * 注意：必须在具体的应用中调用。
     */
    public void setIsAddFooterView(int pageSize, Long total) {
        this.pageSize = pageSize;
        this.total = total;
    }

    @Override
    public void onScrollStateChanged(AbsListView view, int scrollState) {
        currentScrollState = scrollState;

        int lastIndex = view.getLastVisiblePosition();// 适配器数据集在屏幕中显示的最后一项
        int viewCount = view.getCount() - 1; // 适配器中包含的view的总条目数

        // 列表为空
        if (viewCount <= 0) {
            return;
        }

        switch (scrollState) {
            case SCROLL_STATE_IDLE: // 停止滚动
                boolean hasAddFooterView = (Boolean) footerView.getTag();
                if (lastIndex == viewCount && hasAddFooterView && pageSize < total) { // 滚动到最后一项目
                    addListFooterView();
                    onBottomListener.loadMore();
                }
                break;
        }
    }

    @Override
    public void onScroll(AbsListView view, int firstVisibleItem, int visibleItemCount, int totalItemCount) {
        firstItemIndex = firstVisibleItem;
    }

    /**
     * 添加列表页脚
     */
    public View addListFooterView() {
        footerView.setVisibility(VISIBLE);
        footerView.setTag(false);

        footerImg.setVisibility(View.VISIBLE);
        footerText.setText("努力加载中……");

        addFooterView(footerView, null, false);

        //选定当前项
        setSelection(getLastVisiblePosition());

        // 设置图标动画
        Animation operatingAnim = AnimationUtils.loadAnimation(getContext(), R.anim.loading_more_anim);
        footerImg.startAnimation(operatingAnim);

        return footerView;
    }

    /**
     * 根据各种加载状态设置页脚文字
     *
     * @param status 加载更多失败的状态 “1”：已经加载完毕，没有更多数据 “2”：加载更多失败，可能是网络不好等
     * @param text   对应状态下的文字提示
     */
    public void setFooterViewText(int status, String text) {
        if (!(Boolean) footerView.getTag()) {
            footerText.setText(text);
            footerImg.clearAnimation();
            footerImg.setVisibility(View.GONE);

            if (status == 2) {
                footerView.setOnClickListener(new OnClickListener() {

                    @Override
                    public void onClick(View v) {
                        onClickFooterToReloadMore();
                    }
                });
            }
        }
    }

    /**
     * 点击页脚重新加载更多
     */
    private void onClickFooterToReloadMore() {
        removeListFooterView();
        addListFooterView();
        onBottomListener.loadMore();
    }

    /**
     * 加载更多后，移除页脚
     */
    public void removeListFooterView() {
        footerView.setTag(true);
        footerImg.clearAnimation(); // 清除动画
        removeFooterView(footerView);
    }

    public OnBottomListener getOnBottomListener() {
        return onBottomListener;
    }

    public void setOnBottomListener(OnBottomListener onBottomListener) {
        this.onBottomListener = onBottomListener;
    }
}
