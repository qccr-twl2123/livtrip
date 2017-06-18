<input type="hidden" id="pageSize" name="pageSize" value="${page.pageSize}" />
<div class="pagination pagination-small pagination-right">
    <ul>
        <#if page.isFirstPage>
            <li class="prev disabled"><a href="#">«第一页</a></li>
        <#else>
            <li class="prev"><a  class="prev" href="javascript: $.pageSkip(${page.firstPage});">«第一页</a></li>
        </#if>
        <#if page.hasPreviousPage>
            <li class="prev"><a  class="prev" href="javascript: $.pageSkip(${page.nextPage});">«上一页</a></li>
        <#else>
            <li class="prev disabled"><a href="#">«上一页</a></li>
        </#if>

        <#list page.navigatepageNums as segmentPageNumber>
            <#if segmentPageNumber_index == 0 && segmentPageNumber gt page.firstPage + 1>
                <li class="dotted"><span>...</span></li>
            </#if>
            <#if segmentPageNumber != page.pageNum>
                <li><a href="javascript: $.pageSkip(${segmentPageNumber});">${segmentPageNumber}</a></li>
            <#else>
                <li class="active"><a href="#">${segmentPageNumber}</a></li>
            </#if>
            <#if !page.hasNextPage && segmentPageNumber lt page.lastPage - 1>
                <li class="dotted"><span>...</span></li>
            </#if>
        </#list>

        <#if page.hasNextPage>
            <li class="next"><a href="javascript: $.pageSkip(${page.nextPage});">下一页»</a></li>
        <#else>
            <li class="next disabled"><a href="#">下一页»</a></li>
        </#if>
        <#if page.isLastPage>
            <li class="next disabled"><a href="#">最后一页»</a></li>
        <#else>
            <li class="next"><a href="javascript: $.pageSkip(${page.lastPage});">最后一页»</a></li>
        </#if>
    </ul>
    <div><span>共${page.pages}页&nbsp; ${page.total}条记录</span><span>
      到
      <input type="text" class="page-num" id="pageNumber" name="pageNumber" value="${page.pageNum}"><button class="page-confirm" type="submit">确定</button>
      页</span></div>
</div>
