
$(document).ready(function () {

    $("#btnclick").click(function () {
        alert("Well done Brother");
    })


    $('.btn-collapse').click(function (e) {
        e.preventDefault();
        var $this = $(this);
        var $collapse =$this.closest('.collapse-group').find('.collapse');
        $collapse.collapse('toggle');
    });
})