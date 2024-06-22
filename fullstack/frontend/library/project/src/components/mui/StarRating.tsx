import { Rating, Typography } from "@mui/material";
import { useState } from "react";

export const StarRating=()=>{
    let [value,setValue]=useState<any>(1)
    return <>
    starts
    <br />
    <Typography component="legend">Controlled</Typography>
<Rating
  name="simple-controlled"
  value={value}
  onChange={(event, newValue) => {
    setValue(newValue);
  }}
/>
<Typography component="legend">Read only</Typography>
<Rating name="read-only" value={value} readOnly />
<Typography component="legend">Disabled</Typography>
<Rating name="disabled" value={2} disabled />
<Typography component="legend">No rating given</Typography>
<Rating name="no-value" value={null} />
    </>
}