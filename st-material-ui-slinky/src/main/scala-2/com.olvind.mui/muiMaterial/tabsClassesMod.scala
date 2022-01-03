package com.olvind.mui.muiMaterial

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tabsClassesMod {
  
  @JSImport("@mui/material/Tabs/tabsClasses", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@mui/material/Tabs/tabsClasses", JSImport.Default)
  @js.native
  val default: TabsClasses = js.native
  
  @scala.inline
  def getTabsUtilityClass(slot: String): String = ^.asInstanceOf[js.Dynamic].applyDynamic("getTabsUtilityClass")(slot.asInstanceOf[js.Any]).asInstanceOf[String]
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.root
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.vertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.flexContainer
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.flexContainerVertical
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.centered
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scroller
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.fixed
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scrollableX
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scrollableY
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.hideScrollbar
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scrollButtons
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.scrollButtonsHideMobile
    - `com.olvind.mui`.muiMaterial.muiMaterialStrings.indicator
  */
  trait TabsClassKey extends StObject
  
  @js.native
  trait TabsClasses extends StObject {
    
    /** Styles applied to the flex container element if `centered={true}` & `!variant="scrollable"`. */
    var centered: String = js.native
    
    /** Styles applied to the tablist element if `!variant="scrollable"`. */
    var fixed: String = js.native
    
    /** Styles applied to the flex container element. */
    var flexContainer: String = js.native
    
    /** Styles applied to the flex container element if `orientation="vertical"`. */
    var flexContainerVertical: String = js.native
    
    /** Styles applied to the tablist element if `variant="scrollable"` and `visibleScrollbar={false}`. */
    var hideScrollbar: String = js.native
    
    /** Styles applied to the TabIndicator component. */
    var indicator: String = js.native
    
    /** Styles applied to the root element. */
    var root: String = js.native
    
    /** Styles applied to the ScrollButtonComponent component. */
    var scrollButtons: String = js.native
    
    /** Styles applied to the ScrollButtonComponent component if `allowScrollButtonsMobile={true}`. */
    var scrollButtonsHideMobile: String = js.native
    
    /** Styles applied to the tablist element if `variant="scrollable"` and `orientation="horizontal"`. */
    var scrollableX: String = js.native
    
    /** Styles applied to the tablist element if `variant="scrollable"` and `orientation="vertical"`. */
    var scrollableY: String = js.native
    
    /** Styles applied to the tablist element. */
    var scroller: String = js.native
    
    /** Styles applied to the root element if `orientation="vertical"`. */
    var vertical: String = js.native
  }
  object TabsClasses {
    
    @scala.inline
    def apply(
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
    
    @scala.inline
    implicit class TabsClassesMutableBuilder[Self <: TabsClasses] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCentered(value: String): Self = StObject.set(x, "centered", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixed(value: String): Self = StObject.set(x, "fixed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexContainer(value: String): Self = StObject.set(x, "flexContainer", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFlexContainerVertical(value: String): Self = StObject.set(x, "flexContainerVertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideScrollbar(value: String): Self = StObject.set(x, "hideScrollbar", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndicator(value: String): Self = StObject.set(x, "indicator", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoot(value: String): Self = StObject.set(x, "root", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollButtons(value: String): Self = StObject.set(x, "scrollButtons", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollButtonsHideMobile(value: String): Self = StObject.set(x, "scrollButtonsHideMobile", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableX(value: String): Self = StObject.set(x, "scrollableX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScrollableY(value: String): Self = StObject.set(x, "scrollableY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setScroller(value: String): Self = StObject.set(x, "scroller", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: String): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
    }
  }
}
