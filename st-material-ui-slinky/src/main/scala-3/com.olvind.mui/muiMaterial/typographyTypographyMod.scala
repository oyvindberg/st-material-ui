package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Align
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTypographyTypeMapsp
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiMaterial.stylesCreateThemeMod.Theme
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.react.mod.global.JSX.Element
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTypographyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/material-ui/react-breadcrumbs/)
    * - [Typography](https://mui.com/material-ui/react-typography/)
    *
    * API:
    *
    * - [Typography API](https://mui.com/material-ui/api/typography/)
    */
  @JSImport("@mui/material/Typography/Typography", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element] = js.native
  
  type TypographyProps[D /* <: ReactElement */, P] = OverrideProps[TypographyTypeMap[P, D], D]
  
  trait TypographyPropsVariantOverrides extends StObject
  
  trait TypographyTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & SystemProps[Theme] & Align
  }
  object TypographyTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & SystemProps[Theme] & Align): TypographyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TypographyTypeMap[?, ?], P, D /* <: ReactElement */] (val x: Self & (TypographyTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & SystemProps[Theme] & Align): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element]
  
  /* This means you don't have to write `default`, but can instead just say `typographyTypographyMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element] = default
}
