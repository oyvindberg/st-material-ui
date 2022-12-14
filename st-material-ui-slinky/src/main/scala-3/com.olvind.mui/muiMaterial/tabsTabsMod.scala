package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.AllowScrollButtonsMobile
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsExtendButtonBaseTypAction
import com.olvind.mui.muiMaterial.anon.OverridePropsExtendButtonBaseTypeMapButtAbout
import com.olvind.mui.muiMaterial.overridableComponentMod.OverridableComponent
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import org.scalablytyped.runtime.Shortcut
import slinky.core.facade.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsMod extends Shortcut {
  
  /**
    *
    * Demos:
    *
    * - [Tabs](https://mui.com/material-ui/react-tabs/)
    *
    * API:
    *
    * - [Tabs API](https://mui.com/material-ui/api/tabs/)
    */
  @JSImport("@mui/material/Tabs/Tabs", JSImport.Default)
  @js.native
  val default: OverridableComponent[
    TabsTypeMap[
      js.Object, 
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
        ReactElement | Null
      ]
    ]
  ] = js.native
  
  trait TabsActions extends StObject {
    
    def updateIndicator(): Unit
    
    def updateScrollButtons(): Unit
  }
  object TabsActions {
    
    inline def apply(updateIndicator: () => Unit, updateScrollButtons: () => Unit): TabsActions = {
      val __obj = js.Dynamic.literal(updateIndicator = js.Any.fromFunction0(updateIndicator), updateScrollButtons = js.Any.fromFunction0(updateScrollButtons))
      __obj.asInstanceOf[TabsActions]
    }
    
    extension [Self <: TabsActions](x: Self) {
      
      inline def setUpdateIndicator(value: () => Unit): Self = StObject.set(x, "updateIndicator", js.Any.fromFunction0(value))
      
      inline def setUpdateScrollButtons(value: () => Unit): Self = StObject.set(x, "updateScrollButtons", js.Any.fromFunction0(value))
    }
  }
  
  type TabsProps[D /* <: ReactElement */, P] = OverrideProps[TabsTypeMap[P, D], D]
  
  trait TabsPropsIndicatorColorOverrides extends StObject
  
  trait TabsTypeMap[P, D /* <: ReactElement */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & AllowScrollButtonsMobile
  }
  object TabsTypeMap {
    
    inline def apply[P, D /* <: ReactElement */](defaultComponent: D, props: P & AllowScrollButtonsMobile): TabsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsTypeMap[P, D]]
    }
    
    extension [Self <: TabsTypeMap[?, ?], P, D /* <: ReactElement */](x: Self & (TabsTypeMap[P, D])) {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AllowScrollButtonsMobile): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = OverridableComponent[
    TabsTypeMap[
      js.Object, 
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
        ReactElement | Null
      ]
    ]
  ]
  
  /* This means you don't have to write `default`, but can instead just say `tabsTabsMod.foo` */
  override def _to: OverridableComponent[
    TabsTypeMap[
      js.Object, 
      js.Function1[
        /* props */ OverridePropsExtendButtonBaseTypeMapButtAbout | DefaultComponentPropsExtendButtonBaseTypAction, 
        ReactElement | Null
      ]
    ]
  ] = default
}
