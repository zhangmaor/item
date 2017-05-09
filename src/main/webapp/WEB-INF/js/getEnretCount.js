

    function getCount(type,status,enment){
        $.ajax({
            url : "/enret/getcount",
            data : {
                "enretType" : type,
                "enretStatus" : status
            },
            method : "get",
            dataType : 'text',
            success : function(data){

                enment.html(data);
                //alert(count);
            }
        });

    };
    function getResultCount(type,enment) {
        $.ajax({
            url : "/enret/getResultCount",
            data : {
                "id" :type
            },
            method : "get",
            dataType : "text",
            success : function (data) {
                enment.html(data);
            }
        })
    }





