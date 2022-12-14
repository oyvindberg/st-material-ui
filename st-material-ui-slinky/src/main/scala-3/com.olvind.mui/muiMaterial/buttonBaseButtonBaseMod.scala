package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Action
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.Href
import com.olvind.mui.muiMaterial.anon.OmitButtonBaseTypeMapbuttonpropsclasses
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.overridableComponentMod.DefaultComponentProps
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableTypeMap
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.ReactComponentClass
import slinky.core.facade.ReactElement
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
    ReactElement | Null
  ] = js.native
  
  trait ButtonBaseActions extends StObject {
    
    def focusVisible(): Unit
  }
  object ButtonBaseActions {
    
    inline def apply(focusVisible: () => Unit): ButtonBaseActions = {
      val __obj = js.Dynamic.literal(focusVisible = js.Any.fromFunction0(focusVisible))
      __obj.asInstanceOf[ButtonBaseActions]
    }
    
    extension [Self <: ButtonBaseActions](x: Self) {
      
      inline def setFocusVisible(value: () => Unit): Self = StObject.set(x, "focusVisible", js.Any.fromFunction0(value))
    }
  }
  
  type ButtonBaseProps[D /* <: ReactElement */, P] = OverrideProps[ButtonBaseTypeMap[P, D], D]
  
  trait ButtonBaseTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & Action
  }
  object ButtonBaseTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & Action): ButtonBaseTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[ButtonBaseTypeMap[P, D]]
    }
    
    extension [Self <: ButtonBaseTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (ButtonBaseTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & Action): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type ExtendButtonBase[M /* <: OverridableTypeMap */] = ReactComponentClass[
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
    
    extension [Self <: ExtendButtonBaseTypeMap[?], M /* <: OverridableTypeMap */](x: Self & ExtendButtonBaseTypeMap[M]) {
      
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
    ReactElement | Null
  ]
  
  /* This means you don't have to write `default`, but can instead just say `buttonBaseButtonBaseMod.foo` */
  override def _to: js.Function1[
    /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
    ReactElement | Null
  ] = default
}
