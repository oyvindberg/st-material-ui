package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.ButtonTypeMapbuttonprops
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAccessKey
import com.olvind.mui.muiMaterial.anon.DistributiveOmitButtonTypeMapbuttonprops
import com.olvind.mui.muiMaterial.anon.Href
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButt
import com.olvind.mui.muiMaterial.anon.`2`
import com.olvind.mui.muiMaterial.buttonBaseButtonBaseMod.ExtendButtonBaseTypeMap
import com.olvind.mui.muiMaterial.muiMaterialStrings.a
import com.olvind.mui.muiMaterial.overridableComponentMod.DefaultComponentProps
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.ExoticComponent
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonButtonMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Button Group](https://mui.com/components/button-group/)
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [Button API](https://mui.com/api/button/)
    * - inherits [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/Button/Button", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
    Element | Null
  ] = js.native
  
  type ButtonProps[D /* <: ElementType */, P] = OverrideProps[ButtonTypeMap[P, D], D]
  
  trait ButtonPropsColorOverrides extends StObject
  
  trait ButtonPropsSizeOverrides extends StObject
  
  trait ButtonPropsVariantOverrides extends StObject
  
  type ButtonTypeMap[P, D /* <: ElementType */] = ExtendButtonBaseTypeMap[`2`[P, D]]
  
  type ExtendButton[M /* <: OverridableTypeMap */] = ExoticComponent[
    (Href & (OverrideProps[ExtendButtonBaseTypeMap[M], a])) | DefaultComponentProps[ExtendButtonBaseTypeMap[M]]
  ]
  
  trait ExtendButtonTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & (ButtonTypeMapbuttonprops | DistributiveOmitButtonTypeMapbuttonprops)
  }
  object ExtendButtonTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & (ButtonTypeMapbuttonprops | DistributiveOmitButtonTypeMapbuttonprops)
    ): ExtendButtonTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendButtonTypeMap[M]]
    }
    
    extension [Self <: ExtendButtonTypeMap[?], M /* <: OverridableTypeMap */](x: Self & ExtendButtonTypeMap[M]) {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & (ButtonTypeMapbuttonprops | DistributiveOmitButtonTypeMapbuttonprops)
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
    Element | Null
  ] = default
}
