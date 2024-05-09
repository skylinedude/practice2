export const Test=()=>{
    console.log( Manoj({a:'watch'}))
   
    return <h5>im html inside function
         {Manoj({a:'watch'})}
    <Manoj a="bike"></Manoj>
    <hr />
    </h5>
}
type data={a:any}
const Manoj=(data:any)=>{

    return <p>{data.a}</p>
}