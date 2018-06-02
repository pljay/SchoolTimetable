function tablelimit(data) {

        var type = data.type;
        var amount = data.amount;
        var weeks = data.weeks;
        if (type == "否") {
            $("#one p").remove();
            $("#two").remove();
            var thList = $("#one table thead tr").children("th");
            for (var i = 0; i < thList.length; i++) {
                if (i > weeks) {
                    thList.eq(i).remove();
                }
            }
            ;

            var trList = $("#one table tbody ").children("tr");
            for (var i = 0; i < trList.length; i++) {
                if (i > (amount - 1)) {
                    trList.eq(i).remove();
                }
            }
            ;
            var trList = $("#one table tbody ").children("tr");
            for (var i = 0; i < trList.length; i++) {
                var tdList = trList.eq(i).children("td");
                for (var j = 1; j <= tdList.length; j++) {
                    if (j > weeks) {
                        tdList.eq(j - 1).remove();
                    }
                }
            };

        }
        else {
            var thList = $("#one table thead tr").children("th");
            for (var i = 0; i < thList.length; i++) {
                if (i > weeks) {
                    thList.eq(i).remove();
                }
            }
            ;

            var trList = $("#one table tbody ").children("tr");
            for (var i = 0; i < trList.length; i++) {
                if (i > (amount - 1)) {
                    trList.eq(i).remove();
                }
            }
            ;
            var trList = $("#one table tbody ").children("tr");
            for (var i = 0; i < trList.length; i++) {
                var tdList = trList.eq(i).children("td");
                for (var j = 1; j <= tdList.length; j++) {
                    if (j > weeks) {
                        tdList.eq(j - 1).remove();
                    }
                }
            }
            ;
            var thList = $("#two table thead tr").children("th");
            for (var i = 0; i < thList.length; i++) {
                if (i > weeks) {
                    thList.eq(i).remove();
                }
            }
            ;

            var trList = $("#two table tbody ").children("tr");
            for (var i = 0; i < trList.length; i++) {
                if (i > (amount - 1)) {
                    trList.eq(i).remove();
                }
            }
            ;
            var trList = $("#two table tbody ").children("tr");
            for (var i = 0; i < trList.length; i++) {
                var tdList = trList.eq(i).children("td");
                for (var j = 1; j <= tdList.length; j++) {
                    if (j > weeks) {
                        tdList.eq(j - 1).remove();
                    }
                }
            }
            ;

        }


}