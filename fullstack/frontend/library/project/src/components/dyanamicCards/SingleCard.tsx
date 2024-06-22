import { Card, CardActionArea, CardContent, CardMedia, Typography } from '@mui/material'

import('./genric')
interface ISingleCard{
    img:any
}
export const SingleCard:React.FC<ISingleCard>=(props)=>{
    return <>
     <Card sx={{ maxWidth: 280 }}>
      <CardActionArea>
        <CardMedia
          component="img"
          height="140"
          image={props.img}
          alt="green iguana"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            Lion
          </Typography>
          <Typography variant="body2" color="text.secondary">
            Lizards are a widespread group of squamate reptiles, with over 6,000
            species, ranging across all continents except Antarctica
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
  
    </>
}