package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.AllowScrollButtonsMobile
import com.olvind.mui.muiMaterial.anon.DefaultComponentPropsTabsTypeMappropsOve
import com.olvind.mui.muiMaterial.overridableComponentMod.CommonProps
import com.olvind.mui.muiMaterial.overridableComponentMod.OverrideProps
import com.olvind.mui.react.mod.global.JSX.Element
import japgolly.scalajs.react.Callback
import japgolly.scalajs.react.facade.React.ElementType
import org.scalablytyped.runtime.Shortcut
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
  val default: js.Function1[/* props */ DefaultComponentPropsTabsTypeMappropsOve, Element] = js.native
  
  trait TabsActions extends StObject {
    
    def updateIndicator(): Unit
    
    def updateScrollButtons(): Unit
  }
  object TabsActions {
    
    inline def apply(updateIndicator: Callback, updateScrollButtons: Callback): TabsActions = {
      val __obj = js.Dynamic.literal(updateIndicator = updateIndicator.toJsFn, updateScrollButtons = updateScrollButtons.toJsFn)
      __obj.asInstanceOf[TabsActions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsActions] (val x: Self) extends AnyVal {
      
      inline def setUpdateIndicator(value: Callback): Self = StObject.set(x, "updateIndicator", value.toJsFn)
      
      inline def setUpdateScrollButtons(value: Callback): Self = StObject.set(x, "updateScrollButtons", value.toJsFn)
    }
  }
  
  trait TabsEndScrollButtonIconSlotPropsOverrides extends StObject
  
  /* import warning: RemoveDifficultInheritance.summarizeChanges 
  - Dropped @mui/material.@mui/material/Tabs/Tabs.TabsTypeMap<{}, (props : @mui/material.anon.OverridePropsExtendButtonBaseTypeMapButtAbout | @mui/material.anon.DefaultComponentPropsExtendButtonBaseTypAction): react.react.ReactElement | null>['props']
  - Dropped react.react.ComponentPropsWithRef<(props : @mui/material.anon.OverridePropsExtendButtonBaseTypeMapButtAbout | @mui/material.anon.DefaultComponentPropsExtendButtonBaseTypAction): react.react.ReactElement | null> extends any ? std.Omit<react.react.ComponentPropsWithRef<(props : @mui/material.anon.OverridePropsExtendButtonBaseTypeMapButtAbout | @mui/material.anon.DefaultComponentPropsExtendButtonBaseTypAction): react.react.ReactElement | null>, keyof @mui/material.@mui/material/OverridableComponent.BaseProps<@mui/material.@mui/material/Tabs/Tabs.TabsTypeMap<{}, (props : @mui/material.anon.OverridePropsExtendButtonBaseTypeMapButtAbout | @mui/material.anon.DefaultComponentPropsExtendButtonBaseTypAction): react.react.ReactElement | null>>> : never */ trait TabsOwnerState
    extends StObject
       with CommonProps {
    
    var centered: Boolean
    
    var fixed: Boolean
    
    var hideScrollbar: Boolean
    
    var scrollButtonsHideMobile: Boolean
    
    var scrollableX: Boolean
    
    var scrollableY: Boolean
    
    var vertical: Boolean
  }
  object TabsOwnerState {
    
    inline def apply(
      centered: Boolean,
      fixed: Boolean,
      hideScrollbar: Boolean,
      scrollButtonsHideMobile: Boolean,
      scrollableX: Boolean,
      scrollableY: Boolean,
      vertical: Boolean
    ): TabsOwnerState = {
      val __obj = js.Dynamic.literal(centered = centered.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], hideScrollbar = hideScrollbar.asInstanceOf[js.Any], scrollButtonsHideMobile = scrollButtonsHideMobile.asInstanceOf[js.Any], scrollableX = scrollableX.asInstanceOf[js.Any], scrollableY = scrollableY.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsOwnerState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsOwnerState] (val x: Self) extends AnyVal {
      
      inline def setCentered(value: Boolean): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setFixed(value: Boolean): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setHideScrollbar(value: Boolean): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
      
      inline def setScrollButtonsHideMobile(value: Boolean): Self = StObject.set(x, "scrollButtonsHideMobile", value.asInstanceOf[js.Any])
      
      inline def setScrollableX(value: Boolean): Self = StObject.set(x, "scrollableX", value.asInstanceOf[js.Any])
      
      inline def setScrollableY(value: Boolean): Self = StObject.set(x, "scrollableY", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
  
  type TabsProps[D /* <: ElementType */, P] = OverrideProps[TabsTypeMap[P, D], D]
  
  trait TabsPropsIndicatorColorOverrides extends StObject
  
  trait TabsStartScrollButtonIconSlotPropsOverrides extends StObject
  
  trait TabsTypeMap[P, D /* <: ElementType */] extends StObject {
    
    var defaultComponent: D
    
    var props: P & AllowScrollButtonsMobile
  }
  object TabsTypeMap {
    
    inline def apply[P, D /* <: ElementType */](defaultComponent: D, props: P & AllowScrollButtonsMobile): TabsTypeMap[P, D] = {
      val __obj = js.Dynamic.literal(defaultComponent = defaultComponent.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsTypeMap[P, D]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TabsTypeMap[?, ?], P, D /* <: ElementType */] (val x: Self & (TabsTypeMap[P, D])) extends AnyVal {
      
      inline def setDefaultComponent(value: D): Self = StObject.set(x, "defaultComponent", value.asInstanceOf[js.Any])
      
      inline def setProps(value: P & AllowScrollButtonsMobile): Self = StObject.set(x, "props", value.asInstanceOf[js.Any])
    }
  }
  
  type _To = js.Function1[/* props */ DefaultComponentPropsTabsTypeMappropsOve, Element]
  
  /* This means you don't have to write `default`, but can instead just say `tabsTabsMod.foo` */
  override def _to: js.Function1[/* props */ DefaultComponentPropsTabsTypeMappropsOve, Element] = default
}
