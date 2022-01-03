package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.NameProps
import com.olvind.mui.muiMaterial.componentsMod.Components
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useThemePropsMod {
  
  @JSImport("@mui/material/styles/useThemeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Theme /* <: ThemeWithProps */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name]): Props with (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Props with (ThemedProps[Theme, Name])]
  
  @js.native
  trait ThemeWithProps extends StObject {
    
    var components: js.UndefOr[Components] = js.native
  }
  object ThemeWithProps {
    
    @scala.inline
    def apply(): ThemeWithProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeWithProps]
    }
    
    @scala.inline
    implicit class ThemeWithPropsMutableBuilder[Self <: ThemeWithProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setComponents(value: Components): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  type ThemedProps[Theme, Name /* <: /* keyof any */ String */] = js.Object
}
