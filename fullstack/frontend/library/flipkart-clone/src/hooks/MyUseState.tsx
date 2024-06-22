import { useState } from "react"

export const MyUseState=()=>{
    let [data,setDATA]=useState("")

    return <>
    <input type="text" name="" id="" onChange={(e)=>{setDATA(e.target.value)}} />
    <br />
    <h1>{data}</h1>
    </>
}