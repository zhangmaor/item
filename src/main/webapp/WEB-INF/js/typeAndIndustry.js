/*获得全部的一级行业*/
function  getIndustryList() {
    $.ajax({
        url : "/bgEnmg/getIndustry",
        dataType : "json",
        method : "get",
        success : function(data){
            var html = "";
            html += "<option value='0'>请选择</option>";
            $.each(data,function(i,list){
                html += "<option value='"+list.inId+"'>"+list.inName+"</option>";
            });
            $("#IndustryList").html(html);
        }
    });
}
/**
 * 获取全部的企业类型
 */
function getEnType(){
    $.ajax({
        url : "/bgEnmg/getType",
        dataType : "json",
        method : "get",
        success : function(data){
            html = "";
            html +="<option value='0'>请选择</option>";
            $.each(data,function(i,list){
                html +="<option value='"+list.enTypeId+"'>"+list.enTypeNmae+"</option>";
            });
            $("#typelist").html(html);
        }
    });
}
