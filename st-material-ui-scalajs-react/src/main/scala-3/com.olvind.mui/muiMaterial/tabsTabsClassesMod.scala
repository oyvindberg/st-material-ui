package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsTabsClassesMod {
  
  @JSImport("@mui/material/Tabs/tabsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Tabs/tabsClasses", JSImport.Default)
  @js.native
  val default: TabsClasses = js.native
  
  inline def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  type TabsClassKey = "root" | "vertical" | "flexContainer" | "flexContainerVertical" | "centered" | "scroller" | "fixed" | "scrollableX" | "scrollableY" | "hideScrollbar" | "scrollButtons" | "scrollButtonsHideMobile" | "indicator"
  
  trait TabsClasses extends StObject {
    
    /** Styles applied to the flex container element if `centered={true}` & `!variant="scrollable"`. */
    var centered: String
    
    /** Styles applied to the tablist element if `!variant="scrollable"`. */
    var fixed: String
    
    /** Styles applied to the flex container element. */
    var flexContainer: String
    
    /** Styles applied to the flex container element if `orientation="vertical"`. */
    var flexContainerVertical: String
    
    /** Styles applied to the tablist element if `variant="scrollable"` and `visibleScrollbar={false}`. */
    var hideScrollbar: String
    
    /** Styles applied to the TabIndicator component. */
    var indicator: String
    
    /** Styles applied to the root element. */
    var root: String
    
    /** Styles applied to the ScrollButtonComponent component. */
    var scrollButtons: String
    
    /** Styles applied to the ScrollButtonComponent component if `allowScrollButtonsMobile={true}`. */
    var scrollButtonsHideMobile: String
    
    /** Styles applied to the tablist element if `variant="scrollable"` and `orientation="horizontal"`. */
    var scrollableX: String
    
    /** Styles applied to the tablist element if `variant="scrollable"` and `orientation="vertical"`. */
    var scrollableY: String
    
    /** Styles applied to the tablist element. */
    var scroller: String
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String
  }
  object TabsClasses {
    
    inline def apply(
      centered: String,
      fixed: String,
      flexContainer: String,
      flexContainerVertical: String,
      hideScrollbar: String,
      indicator: String,
      root: String,
      scrollButtons: String,
      scrollButtonsHideMobile: String,
      scrollableX: String,
      scrollableY: String,
      scroller: String,
      vertical: String
    ): TabsClasses = {
      val __obj = js.Dynamic.literal(centered = centered.asInstanceOf[js.Any], fixed = fixed.asInstanceOf[js.Any], flexContainer = flexContainer.asInstanceOf[js.Any], flexContainerVertical = flexContainerVertical.asInstanceOf[js.Any], hideScrollbar = hideScrollbar.asInstanceOf[js.Any], indicator = indicator.asInstanceOf[js.Any], root = root.asInstanceOf[js.Any], scrollButtons = scrollButtons.asInstanceOf[js.Any], scrollButtonsHideMobile = scrollButtonsHideMobile.asInstanceOf[js.Any], scrollableX = scrollableX.asInstanceOf[js.Any], scrollableY = scrollableY.asInstanceOf[js.Any], scroller = scroller.asInstanceOf[js.Any], vertical = vertical.asInstanceOf[js.Any])
      __obj.asInstanceOf[TabsClasses]
    }
    
    extension [Self <: TabsClasses](x: Self) {
      
      inline def setCentered(value: String): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      inline def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      inline def setFlexContainer(value: String): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      inline def setFlexContainerVertical(value: String): Self = StObject.set(x, "flexContainerVertical", value.asInstanceOf[js.Any])
      
      inline def setHideScrollbar(value: String): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
      
      inline def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      inline def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      inline def setScrollButtons(value: String): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
      
      inline def setScrollButtonsHideMobile(value: String): Self = StObject.set(x, "scrollButtonsHideMobile", value.asInstanceOf[js.Any])
      
      inline def setScrollableX(value: String): Self = StObject.set(x, "scrollableX", value.asInstanceOf[js.Any])
      
      inline def setScrollableY(value: String): Self = StObject.set(x, "scrollableY", value.asInstanceOf[js.Any])
      
      inline def setScroller(value: String): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
