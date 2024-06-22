import { useState } from "react"

export const MyUseState = () => {
    let [data, setData] = useState("")
    let showText = (e: any) => {
        setData(e.target.value)
    }
    return <>
        <input type="text" onChange={showText} />
        <br />
        <h1>{data}</h1>
    </>
}