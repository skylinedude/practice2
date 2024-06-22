import { Card, CardActionArea, CardContent, CardMedia, Typography } from "@mui/material"
import img from '../../images/4.jpg'
export const Mycards=()=>{
    return <>
     <Card sx={{ maxWidth: 300 }}>
      <CardActionArea>
        <CardMedia
          component="img"
          height="140"
          image={img}
          alt="green iguana"
        />
        <CardContent>
          <Typography gutterBottom variant="h5" component="div">
            Black Swan
          </Typography>
          <Typography variant="body2" color="text.secondary">
          The black swan is a species of swan native to Australia. Unlike the more common white swans, black swans have predominantly black plumage and red bills.
          </Typography>
        </CardContent>
      </CardActionArea>
    </Card>
    
    </>
}