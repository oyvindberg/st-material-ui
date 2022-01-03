package com.olvind.mui.muiSystem

import com.olvind.mui.muiSystem.anon.Mode
import com.olvind.mui.muiSystem.createBreakpointsMod.Breakpoints
import com.olvind.mui.muiSystem.createSpacingMod.Spacing
import com.olvind.mui.muiSystem.shapeMod.Shape
import com.olvind.mui.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createThemeCreateThemeMod {
  
  /* Rewritten from type alias, can be one of: 
    - `com.olvind.mui`.muiSystem.muiSystemStrings.ltr
    - `com.olvind.mui`.muiSystem.muiSystemStrings.rtl
  */
  trait Direction extends StObject
  object Direction {
    
    @scala.inline
    def ltr: com.olvind.mui.muiSystem.muiSystemStrings.ltr = "ltr".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.ltr]
    
    @scala.inline
    def rtl: com.olvind.mui.muiSystem.muiSystemStrings.rtl = "rtl".asInstanceOf[com.olvind.mui.muiSystem.muiSystemStrings.rtl]
  }
  
  @js.native
  trait Theme extends StObject {
    
    var breakpoints: Breakpoints = js.native
    
    var components: js.UndefOr[Record[String, Any]] = js.native
    
    var direction: Direction = js.native
    
    var mixins: js.UndefOr[Any] = js.native
    
    var palette: (Record[String, Any]) with Mode = js.native
    
    var shadows: js.UndefOr[Any] = js.native
    
    var shape: Shape = js.native
    
    var spacing: Spacing = js.native
    
    var transitions: js.UndefOr[Any] = js.native
    
    var typography: js.UndefOr[Any] = js.native
    
    var zIndex: js.UndefOr[Any] = js.native
  }
  object Theme {
    
    @scala.inline
    def apply(
      breakpoints: Breakpoints,
      direction: Direction,
      palette: (Record[String, Any]) with Mode,
      shape: Shape,
      spacing: Spacing
    ): Theme = {
      val __obj = js.Dynamic.literal(breakpoints = breakpoints.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], palette = palette.asInstanceOf[js.Any], shape = shape.asInstanceOf[js.Any], spacing = spacing.asInstanceOf[js.Any])
      __obj.asInstanceOf[Theme]
    }
    
    @scala.inline
    implicit class ThemeMutableBuilder[Self <: Theme] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBreakpoints(value: Breakpoints): Self = StObject.set(x, "breakpoints", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponents(value: Record[String, Any]): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      @scala.inline
      def setDirection(value: Direction): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixins(value: Any): Self = StObject.set(x, "mixins", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMixinsUndefined: Self = StObject.set(x, "mixins", js.undefined)
      
      @scala.inline
      def setPalette(value: (Record[String, Any]) with Mode): Self = StObject.set(x, "palette", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadows(value: Any): Self = StObject.set(x, "shadows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowsUndefined: Self = StObject.set(x, "shadows", js.undefined)
      
      @scala.inline
      def setShape(value: Shape): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpacing(value: Spacing): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitions(value: Any): Self = StObject.set(x, "transitions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTransitionsUndefined: Self = StObject.set(x, "transitions", js.undefined)
      
      @scala.inline
      def setTypography(value: Any): Self = StObject.set(x, "typography", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypographyUndefined: Self = StObject.set(x, "typography", js.undefined)
      
      @scala.inline
      def setZIndex(value: Any): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
    }
  }
}
