package com.olvind.mui.muiMaterial

import com.olvind.mui.emotionSerialize.mod.Interpolation
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object globalStylesGlobalStylesMod {
  
  @JSImport("@mui/material/GlobalStyles/GlobalStyles", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(props: GlobalStylesProps): ReactElement = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(props.asInstanceOf[js.Any]).asInstanceOf[ReactElement]
  
  trait GlobalStylesProps extends StObject {
    
    /**
      * The styles you want to apply globally.
      */
    var styles: Interpolation[Theme]
  }
  object GlobalStylesProps {
    
    inline def apply(): GlobalStylesProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GlobalStylesProps]
    }
    
    extension [Self <: GlobalStylesProps](x: Self) {
      
      inline def setStyles(value: Interpolation[Theme]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesNull: Self = StObject.set(x, "styles", null)
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
