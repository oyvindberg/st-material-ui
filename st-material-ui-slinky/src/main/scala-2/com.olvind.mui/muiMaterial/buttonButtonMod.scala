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
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
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
    ReactElement | Null
  ] = js.native
  
  type ButtonProps[D /* <: ReactElement */, P] = OverrideProps[ButtonTypeMap[P, D], D]
  
  @js.native
  trait ButtonPropsColorOverrides extends StObject
  
  @js.native
  trait ButtonPropsSizeOverrides extends StObject
  
  @js.native
  trait ButtonPropsVariantOverrides extends StObject
  
  type ButtonTypeMap[P, D /* <: ReactElement */] = ExtendButtonBaseTypeMap[`2`[P, D]]
  
  type ExtendButton[M /* <: OverridableTypeMap */] = ReactComponentClass[
    (Href with (OverrideProps[ExtendButtonBaseTypeMap[M], a])) | DefaultComponentProps[ExtendButtonBaseTypeMap[M]]
  ]
  
  @js.native
  trait ExtendButtonTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with (ButtonTypeMapbuttonprops | DistributiveOmitButtonTypeMapbuttonprops) = js.native
  }
  object ExtendButtonTypeMap {
    
    @scala.inline
    def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with (ButtonTypeMapbuttonprops | DistributiveOmitButtonTypeMapbuttonprops)
    ): ExtendButtonTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendButtonTypeMap[M]]
    }
    
    @scala.inline
    implicit class ExtendButtonTypeMapMutableBuilder[Self <: ExtendButtonTypeMap[_], M /* <: OverridableTypeMap */] (val x: Self with ExtendButtonTypeMap[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with (ButtonTypeMapbuttonprops | DistributiveOmitButtonTypeMapbuttonprops)
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `buttonButtonMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButt | DefaultComponentPropsExtendButtonBaseTypAccessKey, 
    ReactElement | Null
  ] = default
}
