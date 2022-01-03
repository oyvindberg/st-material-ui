package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Action
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.Href
import com.olvind.mui.muiMaterial.anon.OmitButtonBaseTypeMapbuttonpropsclasses
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.muiMaterialStrings.a
import com.olvind.mui.muiMaterial.overridableComponentMod.DefaultComponentProps
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.ExoticComponent
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.Element
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseButtonBaseMod extends Shortcut {
  
  /**
    * `ButtonBase` contains as few styles as possible.
    * It aims to be a simple building block for creating a button.
    * It contains a load of style reset and some focus/ripple logic.
    *
    * Demos:
    *
    * - [Buttons](https://mui.com/components/buttons/)
    *
    * API:
    *
    * - [ButtonBase API](https://mui.com/api/button-base/)
    */
  @JSImport("@mui/material/ButtonBase/ButtonBase", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
    Element | Null
  ] = js.native
  
  @js.native
  trait ButtonBaseActions extends StObject {
    
    def focusVisible(): Unit = js.native
  }
  object ButtonBaseActions {
    
    @scala.inline
    def apply(focusVisible: Callback): ButtonBaseActions = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
      __obj.asInstanceOf[ButtonBaseActions]
    }
    
    @scala.inline
    implicit class ButtonBaseActionsMutableBuilder[Self <: ButtonBaseActions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
    }
  }
  
  type ButtonBaseProps[D /* <: ElementType */, P] = OverrideProps[ButtonBaseTypeMap[P, D], D]
  
  @js.native
  trait ButtonBaseTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D = js.native
    
    var props: P with Action = js.native
  }
  object ButtonBaseTypeMap {
    
    @scala.inline
    def apply[P, D /* <: ElementType */](defaultComponent: D, props: P with Action): ButtonBaseTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonBaseTypeMap[P, D]]
    }
    
    @scala.inline
    implicit class ButtonBaseTypeMapMutableBuilder[Self <: ButtonBaseTypeMap[_, _], P, D /* <: ElementType */] (val x: Self with (ButtonBaseTypeMap[P, D])) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(value: P with Action): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtendButtonBase[M /* <: OverridableTypeMap */] = ExoticComponent[
    (Href with (OverrideProps[ExtendButtonBaseTypeMap[M], a])) | DefaultComponentProps[ExtendButtonBaseTypeMap[M]]
  ]
  
  @js.native
  trait ExtendButtonBaseTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any = js.native
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with OmitButtonBaseTypeMapbuttonpropsclasses = js.native
  }
  object ExtendButtonBaseTypeMap {
    
    @scala.inline
    def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with OmitButtonBaseTypeMapbuttonpropsclasses
    ): ExtendButtonBaseTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendButtonBaseTypeMap[M]]
    }
    
    @scala.inline
    implicit class ExtendButtonBaseTypeMapMutableBuilder[Self <: ExtendButtonBaseTypeMap[_], M /* <: OverridableTypeMap */] (val x: Self with ExtendButtonBaseTypeMap[M]) extends AnyVal {
      
      @scala.inline
      def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) with OmitButtonBaseTypeMapbuttonpropsclasses
      ): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
    Element | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `buttonBaseButtonBaseMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
    Element | Null
  ] = default
}
