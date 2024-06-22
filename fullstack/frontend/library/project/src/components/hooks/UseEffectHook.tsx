import { useEffect, useState } from "react"
import { flipkartApi } from "../api/flipkart"

export const UseEffectHook:React.FC<{}>=()=>{
  

    let [name,setName]=useState<any>([])

    useEffect(()=>{
        flipkartApi().then((e)=>{
            setName(e)
            console.log("im from inside",e)
        })
    },[])



    return <>hooks---useState
    <input type="text" name="" id="" onChange={(e)=>{setName([e.target.value])}} />
    <br />
    {name.map((e:any)=>{
        return  <h1>{e.title}</h1> 
    })}
    </>
}