package com.olvind.mui.muiMaterial

import com.olvind.mui.muiSystem.createThemeCreateBreakpointsMod.Breakpoint
import com.olvind.mui.muiTypes.mod.PropInjector
import com.olvind.mui.react.mod.Ref
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hiddenWithWidthMod {
  
  @JSImport("@mui/material/Hidden/withWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  inline def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  
  inline def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  inline def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  trait WithWidth extends StObject {
    
    var width: Breakpoint
  }
  object WithWidth {
    
    inline def apply(width: Breakpoint): WithWidth = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWidth]
    }
    
    extension [Self <: WithWidth](x: Self) {
      
      inline def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait WithWidthOptions extends StObject {
    
    var initialWidth: js.UndefOr[Breakpoint] = js.undefined
    
    var noSSR: js.UndefOr[Boolean] = js.undefined
    
    var resizeInterval: js.UndefOr[Double] = js.undefined
    
    var withTheme: js.UndefOr[Boolean] = js.undefined
  }
  object WithWidthOptions {
    
    inline def apply(): WithWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthOptions]
    }
    
    extension [Self <: WithWidthOptions](x: Self) {
      
      inline def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      inline def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      inline def setNoSSR(value: Boolean): Self = StObject.set(x, "noSSR", value.asInstanceOf[js.Any])
      
      inline def setNoSSRUndefined: Self = StObject.set(x, "noSSR", js.undefined)
      
      inline def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      inline def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
      
      inline def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
      
      inline def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<@mui/material.@mui/material/Hidden/withWidth.WithWidth> */
  trait WithWidthProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[Any]] = js.undefined
    
    var width: js.UndefOr[Breakpoint] = js.undefined
  }
  object WithWidthProps {
    
    inline def apply(): WithWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthProps]
    }
    
    extension [Self <: WithWidthProps](x: Self) {
      
      inline def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      inline def setInnerRefFunction1(value: Any | Null => Callback): Self = StObject.set(x, "innerRef", js.Any.fromFunction1((t0: Any | Null) => value(t0).runNow()))
      
      inline def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      inline def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      inline def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      inline def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
