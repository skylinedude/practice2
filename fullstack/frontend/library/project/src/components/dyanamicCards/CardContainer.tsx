import { Grid, Paper } from "@mui/material"
import img1 from '../../images/1.jpg'
import img2 from '../../images/2.jpeg'
import img3 from '../../images/3.jpeg'
import img4 from '../../images/4.jpg'
import { SingleCard } from "./SingleCard"

export const CardContainer=()=>{
    return <>
    <Paper style={{padding:'10px',margin:'5px'}}>
    <Grid
  container
  direction="row"
  justifyContent="space-between"
  alignItems="center"
>
    <SingleCard img={img1}/>
    <SingleCard img={img2}/>
    <SingleCard img={img3}/>
    <SingleCard img={img4}/>
</Grid>
    </Paper>


    </>
}