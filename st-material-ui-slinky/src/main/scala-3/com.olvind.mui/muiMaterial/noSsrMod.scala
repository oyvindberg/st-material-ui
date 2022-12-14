package com.olvind.mui.muiMaterial

import com.olvind.mui.muiBase.noSsrNoSsrDottypesMod.NoSsrProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrMod {
  
  object default {
    
    /**
      * NoSsr purposely removes components from the subject of Server Side Rendering (SSR).
      *
      * This component can be useful in a variety of situations:
      *
      * *   Escape hatch for broken dependencies not supporting SSR.
      * *   Improve the time-to-first paint on the client by only rendering above the fold.
      * *   Reduce the rendering time on the server.
      * *   Under too heavy server load, you can turn on service degradation.
      *
      * Demos:
      *
      * - [No SSR](https://mui.com/base/react-no-ssr/)
      *
      * API:
      *
      * - [NoSsr API](https://mui.com/base/react-no-ssr/components-api/#no-ssr)
      */
    inline def apply(props: NoSsrProps): Element = ^.asInstanceOf[js.Dynamic].apply(props.asInstanceOf[js.Any]).asInstanceOf[Element]
    
    @JSImport("@mui/material/NoSsr", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@mui/material/NoSsr", "default.propTypes")
    @js.native
    def propTypes: Any = js.native
    inline def propTypes_=(x: Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("propTypes")(x.asInstanceOf[js.Any])
  }
}
