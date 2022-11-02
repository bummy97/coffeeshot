$(document).ready(function (){
   $('#cafelist').on('change', function (){
      var cafelist = $("#cafelist option:selected").val();
      console.log(cafelist);
   });
});