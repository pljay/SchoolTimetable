/*
* 
* Credits to http://css-tricks.com/long-dropdowns-solution/
*
*/

var maxHeight = 400;

$(function(){

    $(".dropdown > li").hover(function() {
    
         var $container = $(this),
             $list = $container.find("ul"),
             $anchor = $container.find("a"),
             height = $list.height() * 1.1,       // make sure there is enough room at the bottom
             multiplier = height / maxHeight;     // needs to move faster if list is taller
        
        // need to save height here so it can revert on mouseout            
        $container.data("origHeight", $container.height());
        
        // so it can retain it's rollover color all the while the dropdown is open
        $anchor.addClass("hover");
        
        // make sure dropdown appears directly below parent list item    
        $list
            .show()
            .css({
                paddingTop: $container.data("origHeight")
            });
        
        // don't do any animation if list shorter than max
        if (multiplier > 1) {
            $container
                .css({
                    height: maxHeight,
                    overflow: "hidden"
                })
                .mousemove(function(e) {
                    var offset = $container.offset();
                    var relativeY = ((e.pageY - offset.top) * multiplier) - ($container.data("origHeight") * multiplier);
                    if (relativeY > $container.data("origHeight")) {
                        $list.css("top", -relativeY + $container.data("origHeight"));
                    };
                });
        }
        
    }, function() {
    
        var $el = $(this);
        
        // put things back to normal
        $el
            .height($(this).data("origHeight"))
            .find("ul")
            .css({ top: 0 })
            .hide()
            .end()
            .find("a")
            .removeClass("hover");
    
    });  
    
});
function a(){
    $.ajax({
        type:"get",
        url:"index1.jsp",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").html(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
};
function b(){
    $.ajax({
        type:"get",
        url:"index2.html",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
};
function c(){
    $.ajax({
        type:"get",
        url:"index3.html",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
};
function d(){
    $.ajax({
        type:"get",
        url:"index3.html",
        dataType:"html",
        date:"",
        success:function(data){
            console.log(data)
            $(".row").html(data);
        },
        error:function(jqXHR){
            $("#row").html("发生错误:"+jqXHR.status);
        }
    });
};
function e(){
    $.ajax({
        type:"get",
        url:"index4.html",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
};
function f(){
    $.ajax({
        type:"get",
        url:"index5.html",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
};
function g() {
    $.ajax({
        type:"get",
        url:"index6.html",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
};
function h() {
    $.ajax({
        type:"get",
        url:"indextree2.htm",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
    
}
function i() {
    $.ajax({
        type:"get",
        url:"index8.html",
        dataType:"html",
        date:"",
        success:function(data){
            $(".row").empty();
            $(".row").append(data);
        },
        error:function(jqXHR){
            $(".row").html("发生错误:"+jqXHR.status);
        }
    });
}