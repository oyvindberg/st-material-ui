package com.olvind.mui.muiBase

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object noSsrNoSsrMod {
  
  @js.native
  trait NoSsrProps extends StObject {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * If `true`, the component will not only prevent server-side rendering.
      * It will also defer the rendering of the children into a different screen frame.
      * @default false
      */
    var defer: js.UndefOr[Boolean] = js.native
    
    /**
      * The fallback content to display.
      * @default null
      */
    var fallback: js.UndefOr[ReactElement] = js.native
  }
  object NoSsrProps {
    
    @scala.inline
    def apply(): NoSsrProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NoSsrProps]
    }
    
    @scala.inline
    implicit class NoSsrPropsMutableBuilder[Self <: NoSsrProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setDefer(value: Boolean): Self = StObject.set(x, "defer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDeferUndefined: Self = StObject.set(x, "defer", js.undefined)
      
      @scala.inline
      def setFallback(value: ReactElement): Self = StObject.set(x, "fallback", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFallbackUndefined: Self = StObject.set(x, "fallback", js.undefined)
    }
  }
}
