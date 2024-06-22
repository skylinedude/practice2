import React from 'react'

export default function Fragment() {
  return (
   <>
   <h1>Fragment</h1>
   <p>
   In React, a Fragment is a common way to group a list of children elements without adding extra nodes to the DOM. This can be useful to avoid unnecessary HTML elements and to maintain a cleaner DOM structure. Fragments can be used in two ways: using the {`<React.Fragment>`} syntax or the shorthand syntax {`<> </>`}.
   <h2>Using {`<React.Fragment>`}</h2>
            <pre> 
                {
                `import React from 'react';
                function MyComponent() {
                    return (
                    <React.Fragment>
                <h1>Title</h1>
                <p>This is a paragraph.</p>
                </React.Fragment>
                );
                }
            export default MyComponent;
    `}
    </pre>
<h2>Using Shorthand Syntax {`<> </>`}</h2>
<pre>
    {
        `import React from 'react';

        function MyComponent() {
          return (
            <>
              <h1>Title</h1>
              <p>This is a paragraph.</p>
            </>
          );
        }
        
        export default MyComponent; `
    }
</pre>
   </p>
   </>
  )
}
