package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Action
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.Href
import com.olvind.mui.muiMaterial.anon.OmitButtonBaseTypeMapbuttonpropsclasses
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object buttonBaseButtonBaseMod extends Shortcut {
  
  /**
    * `ButtonBase` contains as few styles as possible.
    * It aims to be a simple building block for creating a button.
    * It contains a load of style reset and some focus/ripple logic.
    *
    * Demos:
    *
    * - [Button](https://mui.com/material-ui/react-button/)
    *
    * API:
    *
    * - [ButtonBase API](https://mui.com/material-ui/api/button-base/)
    */
  @JSImport("@mui/material/ButtonBase/ButtonBase", JSImport.Default)
  @js.native
  val default: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
    Element | Null
  ] = js.native
  
  trait ButtonBaseActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonBaseActions {
    
    inline def apply(focusVisible: Callback): ButtonBaseActions = {
      val __obj = js.Dynamic.literal(focusVisible = focusVisible.toJsFn)
      __obj.asInstanceOf[ButtonBaseActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonBaseActions] (val x: Self) extends AnyVal {
      
      inline def setFocusVisible(value: Callback): Self = StObject.set(x, "focusVisible", value.toJsFn)
    }
  }
  
  type ButtonBaseProps[D /* <: ElementType */, P] = OverrideProps[ButtonBaseTypeMap[P, D], D]
  
  trait ButtonBaseTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Action
  }
  object ButtonBaseTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & Action): ButtonBaseTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonBaseTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ButtonBaseTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (ButtonBaseTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Action): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtendButtonBase[M /* <: OverridableTypeMap */] = ExoticComponent[
    (Href & (OverrideProps[ExtendButtonBaseTypeMap[M], "a"])) | DefaultComponentProps[ExtendButtonBaseTypeMap[M]]
  ]
  
  trait ExtendButtonBaseTypeMap[M /* <: OverridableTypeMap */] extends StObject {
    
    var defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
    
    var props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & OmitButtonBaseTypeMapbuttonpropsclasses
  }
  object ExtendButtonBaseTypeMap {
    
    inline def apply[M /* <: OverridableTypeMap */](
      defaultComponent: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any,
      props: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & OmitButtonBaseTypeMapbuttonpropsclasses
    ): ExtendButtonBaseTypeMap[M] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ExtendButtonBaseTypeMap[M]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ExtendButtonBaseTypeMap[?], M /* <: OverridableTypeMap */] (val x: Self & ExtendButtonBaseTypeMap[M]) extends AnyVal {
      
      inline def setDefaultComponent(
        value: /* import warning: importer.ImportType#apply Failed type conversion: M['defaultComponent'] */ js.Any
      ): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(
        value: (/* import warning: importer.ImportType#apply Failed type conversion: M['props'] */ js.Any) & OmitButtonBaseTypeMapbuttonpropsclasses
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
