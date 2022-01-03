package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.stylesMod.StyledComponentProps
import com.olvind.mui.react.mod.global.JSX.Element
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cssBaselineCssBaselineMod {
  
  @JSImport("@mui/material/CssBaseline/CssBaseline", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: CssBaselineProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait CssBaselineProps
    extends StObject
       with StyledComponentProps[scala.Nothing] {
    
    /**
      * You can wrap a node.
      */
    var children: js.UndefOr[ReactElement] = js.native
    
    /**
      * Enable `color-scheme` CSS property to use `theme.palette.mode`.
      * For more details, check out https://developer.mozilla.org/en-US/docs/Web/CSS/color-scheme
      * For browser support, check out https://caniuse.com/?search=color-scheme
      * @default false
      */
    var enableColorScheme: js.UndefOr[Boolean] = js.native
  }
  object CssBaselineProps {
    
    @scala.inline
    def apply(): CssBaselineProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CssBaselineProps]
    }
    
    @scala.inline
    implicit class CssBaselinePropsMutableBuilder[Self <: CssBaselineProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChildren(value: ReactElement): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setEnableColorScheme(value: Boolean): Self = StObject.set(x, "enableColorScheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableColorSchemeUndefined: Self = StObject.set(x, "enableColorScheme", js.undefined)
    }
  }
}
