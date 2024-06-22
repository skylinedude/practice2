<script>
    async function apiCaller(){
         let api=fetch('https://fakestoreapi.com/products')
         console.log(await (await api).json())
     }
   apiCaller()
 </script>