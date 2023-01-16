$(document).ready(function (){
   $('#btn_back').on('click', function (){
      window.location.href = "/";
   });

   $('#btn_back_makemenu').on('click', function (){
      window.location.href = "/menulist";
   });

   $('button[name=show_menu]').on('click', function (){
      let idx = $(this).val();
      console.log(idx);

      $.ajax({
         url : "/showMenu",
         type : "POST",
         data : {"idx" : idx},
         datatype : "json",
         success : function (){
            console.log("성공");
         },
         error : function (){
            console.log("실패");
         }
      });
   });
});