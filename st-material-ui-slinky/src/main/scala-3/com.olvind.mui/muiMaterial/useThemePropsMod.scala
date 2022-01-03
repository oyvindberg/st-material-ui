package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.NameProps
import com.olvind.mui.muiMaterial.componentsMod.Components
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThemePropsMod {
  
  @JSImport("@mui/material/styles/useThemeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme /* <: ThemeWithProps */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  trait ThemeWithProps extends StObject {
    
    var components: js.UndefOr[Components] = js.undefined
  }
  object ThemeWithProps {
    
    inline def apply(): ThemeWithProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeWithProps]
    }
    
    extension [Self <: ThemeWithProps](x: Self) {
      
      inline def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  type ThemedProps[Theme, Name /* <: /* keyof any */ String */] = js.Object
}
