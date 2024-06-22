export const Parent=()=>{
    return <>
    <h1>props concept</h1>
    <br />
    <Chald data={"hello 1"}/>
    <Chald data={"hello 2"}/>

    </>
}
type tChald={
    data:any
}
let Chald=(props:tChald)=>{
    let something=fun("im giftt1")
    let something2=fun("im giftt12")
    console.log("data")
    return <p>{props.data}{something}{something2}</p>
}
let fun=(data:String)=>{
    return <h1>{data}</h1>
}