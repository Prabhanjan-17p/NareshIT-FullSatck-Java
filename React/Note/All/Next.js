useMemo & useCallback in Video Library project:

useMemo     : You can cache a value to use across multiple requests.
useCallback    : You can cache a function to use across requests and avoid re-render.
           
- To Implement in Video Library project
- You can setup for Loading Videos and Signout in both admin or user dash board

Syntax:
    const  LoadVideos  = useCallback(()=>{
   
            // axios to fetch the videos..

    },[videos.length]);

    const  handleSignout = useCallback(()=>{
           .... navigate to home...
           ... remove cookie...
    },[removeCookie, navigate]);

- Handle Conditional Rendering, if there are no videos the display empty with message no-videos available else load all videos.

    if( !videos  || videos.length===0) {
   
        render(
            <tr>
                <td> No Videos </td>
            </tr>
            )
    } else {
         render (
            {
                videos.map() => <tr> </tr>
            })
    }


ERP Application - Shopping  - 9 Modules
- Admin Module
- User Module
- Products Module / search
- Shipping Module
- Shopping Cart


                                 Next JS
- It is a React framework.
- A framework allows to build application and also to control the application flow.
- It provides various features to build a complete end to end application with React in the front end.

Features of Next JS:

1. It is a framework
   
        - It can build and control the flow.
        - It provides a modular framework.
        - Application specific logic.
        - Light weight and faster.

2. It support server side rendering

        - It provides server side components
        - Components are pre-rendered on server
        - Data is ready to render
        - Improves performance

3. It provides fluid & responsive Images
       
        - It comprises of <Image> component
        - It implements lazy loading of images.
        - It improves performance of page when it have lot of images to load.

4. API routes / File based routing

        - Route is very simple
        - It handles both client side and server side routes.
        - Routes are in-built

    Ex:
          src
            fashion/page.js        
            electronics/page.js
           
           http://...../fashion

5. Built in support for Tailwind CSS and Sass


Creating a new React Next JS application:

1. Open any location on your PC

2. Run the command

        > npx   create-next-app@latest   [app_name_optional]

3. Run app

        > npm run dev