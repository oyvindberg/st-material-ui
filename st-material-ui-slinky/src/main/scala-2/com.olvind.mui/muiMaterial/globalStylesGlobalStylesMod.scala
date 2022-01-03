package com.olvind.mui.muiMaterial

import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalStylesGlobalStylesMod {
  
  @JSImport("@mui/material/GlobalStyles/GlobalStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(props: GlobalStylesProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  @js.native
  trait GlobalStylesProps extends StObject {
    
    /**
      * The styles you want to apply globally.
      */
    var styles: Interpolation[Theme] = js.native
  }
  object GlobalStylesProps {
    
    @scala.inline
    def apply(): GlobalStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalStylesProps]
    }
    
    @scala.inline
    implicit class GlobalStylesPropsMutableBuilder[Self <: GlobalStylesProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesNull: Self = StObject.set(x, "styles", null)
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
