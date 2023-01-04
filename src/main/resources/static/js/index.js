$(document).ready(function (){
   $('#btn_back').on('click', function (){
      window.location.href = "/";
   });

   $('#btn_back_makemenu').on('click', function (){
      window.location.href = "/menulist";
   })

   $('#move_menu').on('click', function (){
      var idx = $(this).val();
      console.log(idx);
   })
});