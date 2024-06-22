import { Box, Grid } from "@mui/material"
import MynavBar from "../../MyNavbar/MyNavbar"
import { Myslider } from "../../MySlider/Myslider"
import { CardContainerApi } from "../../apiDataDisplay/CardContainerApi"


export const Home=()=>{
    return <>
    <Box>
        
<Grid

  direction="column"
  justifyContent="center"
  alignItems="center"
>
    <MynavBar/>
    <br />
    <Myslider/>
    <br />
    <CardContainerApi/>
</Grid>

    </Box>
    
    
    
    </>
}