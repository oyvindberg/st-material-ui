package com.olvind.mui.muiJoy

import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssBaselineCssBaselinePropsMod {
  
  trait CssBaselineProps extends StObject {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[ReactElement] = js.undefined
    
    /**
      * Disable `color-scheme` CSS property.
      *
      * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
      * For browser support, check out https://caniuse.com/?search=color-scheme
      * @default false
      */
    var disableColorScheme: js.UndefOr[Boolean] = js.undefined
  }
  object CssBaselineProps {
    
    inline def apply(): CssBaselineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssBaselineProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CssBaselineProps] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setDisableColorScheme(value: Boolean): Self = StObject.set(x, "disableColorScheme", value.asInstanceOf[js.Any])
      
      inline def setDisableColorSchemeUndefined: Self = StObject.set(x, "disableColorScheme", js.undefined)
    }
  }
}
