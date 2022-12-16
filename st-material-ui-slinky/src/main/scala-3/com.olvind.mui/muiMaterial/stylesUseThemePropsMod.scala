package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.NameProps
import com.olvind.mui.muiMaterial.anon.OmitThemecomponents
import com.olvind.mui.muiMaterial.stylesComponentsMod.Components
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stylesUseThemePropsMod {
  
  @JSImport("@mui/material/styles/useThemeProps", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[Theme /* <: ThemeWithProps */, Props, Name /* <: /* keyof any */ String */](params: NameProps[Props, Name]): Props & (ThemedProps[Theme, Name]) = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(params.asInstanceOf[js.Any]).asInstanceOf[Props & (ThemedProps[Theme, Name])]
  
  trait ThemeWithProps extends StObject {
    
    var components: js.UndefOr[Components[OmitThemecomponents]] = js.undefined
  }
  object ThemeWithProps {
    
    inline def apply(): ThemeWithProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ThemeWithProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ThemeWithProps] (val x: Self) extends AnyVal {
      
      inline def setComponents(value: Components[OmitThemecomponents]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately.
    * TS definition: {{{
    Theme extends {  components :std.Record<Name, {  defaultProps :infer Props}>} ? Props : {}
    }}}
    */
  @js.native
  trait ThemedProps[Theme, Name /* <: /* keyof any */ String */] extends StObject
}
