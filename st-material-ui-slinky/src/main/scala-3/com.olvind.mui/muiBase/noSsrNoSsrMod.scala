package com.olvind.mui.muiBase

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrNoSsrMod {
  
  trait NoSsrProps extends StObject {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * If `true`, the component will not only prevent server-side rendering.
      * It will also defer the rendering of the children into a different screen frame.
      * @default false
      */
    var defer: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The fallback content to display.
      * @default null
      */
    var fallback: js.UndefOr[ReactElement] = js.undefined
  }
  object NoSsrProps {
    
    inline def apply(): NoSsrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoSsrProps]
    }
    
    extension [Self <: NoSsrProps](x: Self) {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      inline def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      inline def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      inline def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
