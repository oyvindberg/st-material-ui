package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Align
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTypographyTypeMapsp
import com.olvind.mui.muiMaterial.createThemeMod.Theme
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.muiSystem.boxBoxMod.SystemProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typographyTypographyMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Breadcrumbs](https://mui.com/components/breadcrumbs/)
    * - [Typography](https://mui.com/components/typography/)
    *
    * API:
    *
    * - [Typography API](https://mui.com/api/typography/)
    */
  @JSImport("@mui/material/Typography/Typography", JSImport.Default)
  @js.native
  val default: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element] = js.native
  
  type TypographyProps[D /* <: ElementType */, P] = OverrideProps[TypographyTypeMap[P, D], D]
  
  @js.native
  trait TypographyPropsVariantOverrides extends StObject
  
  @js.native
  trait TypographyTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with SystemProps[Theme] with Align = js.native
  }
  object TypographyTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with SystemProps[Theme] with Align): TypographyTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TypographyTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class TypographyTypeMapMutableBuilder[Self <: TypographyTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (TypographyTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with SystemProps[Theme] with Align): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element]
  
  /* This means you don't have to write `default`, but can instead just say `typographyTypographyMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTypographyTypeMapsp, Element] = default
}
