import { WhatsappIcon, WhatsappShareButton,InstapaperShareButton, InstapaperIcon,RedditShareButton, RedditIcon } from "react-share"

export const Sharing=()=>{
    return <>
    <>
    <WhatsappShareButton
    url="https://www.wikipedia.org/"
    about="something"
    >
        <WhatsappIcon size={32} round={true} />
    </WhatsappShareButton>
    
       <br />  <br />
    <InstapaperShareButton url="https://mui.com/" title="MUI Documentation">
    <InstapaperIcon size={32} round />
  </InstapaperShareButton>
<br /> <br />
  <RedditShareButton url="https://mui.com/" title="MUI documentation" >
  <RedditIcon size={32} round />
  </RedditShareButton>

    </>

    
    </>
}