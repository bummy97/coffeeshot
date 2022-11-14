$(document).ready(function (){
   $('#btn_back').on('click', function (){
      window.location.href = "/";
   });

   $('#btn_makelist').on('click', function (){
      var cafelist = $('#cafelist').val();
      var user_num = $('#usernumber').val();

      $.ajax({
         url:"/makelist",
         data: {
            cafe_name : cafelist,
            user_number : user_num
         },
         dataType : "json",
         success : function (data){
            console.log(data);
         }

      });
   });
});