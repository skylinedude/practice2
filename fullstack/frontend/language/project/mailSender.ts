const nodemailer= require('nodemailer');

let middlePerson = nodemailer.createTransport({
    service: 'gmail',
    auth: {
        user: 'akonsamrat007@gmail.com',
        pass: 'xrhjskwpyvhiopfc'
    },
    tls: {
        rejectUnauthorized: false
    }
});

let mailoptions = {
    from: 'akonsamrat007@gmail.com',
    to: 'manoj1999gtr@gmail.com',
    subject: 'Job Opportunity for Fresher Front-End Developer',
    text: 'hi hello send me mail from u'
};

middlePerson.sendMail(mailoptions, (err: Error | null, info: any) => {
    if (err) {
        console.log(err);
    } else {
        console.log("Mail sent: " + info.response);
    }
});