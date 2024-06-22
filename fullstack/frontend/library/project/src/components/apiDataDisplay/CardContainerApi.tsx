import { useEffect, useState } from "react"
import { flipkartApi } from "../api/flipkart"
import { Grid, Paper } from "@mui/material"
import { SingleCard } from "../dyanamicCards/SingleCard"

export const CardContainerApi=()=>{
let [data,setData]=useState([])
useEffect(() => {
    (async () => {
        setData(await flipkartApi())
    })()

}, [])
return <>
 <Paper style={{ padding: '10px', margin: '5px' }}>
            <Grid
                container
                direction="row"
                justifyContent="space-between"
                alignItems="center"
            >
                {data.map((e: any) => {
                    return <SingleCard img={e.image} />
                })}


            </Grid>
        </Paper>
</>
}
