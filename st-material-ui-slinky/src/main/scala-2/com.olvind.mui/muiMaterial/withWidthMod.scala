package com.olvind.mui.muiMaterial

import com.olvind.mui.muiSystem.createBreakpointsMod.Breakpoint
import com.olvind.mui.muiTypes.mod.PropInjector
import com.olvind.mui.react.mod.Ref
import slinky.core.facade.ReactRef
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object withWidthMod {
  
  @JSImport("@mui/material/Hidden/withWidth", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default(): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  @scala.inline
  def default(options: WithWidthOptions): PropInjector[WithWidth, WithWidthProps] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(options.asInstanceOf[js.Any]).asInstanceOf[PropInjector[WithWidth, WithWidthProps]]
  
  @scala.inline
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isWidthDown(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthDown")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def isWidthUp(breakpoint: Breakpoint, screenWidth: Breakpoint, inclusive: Boolean): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("isWidthUp")(breakpoint.asInstanceOf[js.Any], screenWidth.asInstanceOf[js.Any], inclusive.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait WithWidth extends StObject {
    
    var width: Breakpoint = js.native
  }
  object WithWidth {
    
    @scala.inline
    def apply(width: Breakpoint): WithWidth = {
      val __obj = js.Dynamic.literal(width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[WithWidth]
    }
    
    @scala.inline
    implicit class WithWidthMutableBuilder[Self <: WithWidth] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait WithWidthOptions extends StObject {
    
    var initialWidth: js.UndefOr[Breakpoint] = js.native
    
    var noSSR: js.UndefOr[Boolean] = js.native
    
    var resizeInterval: js.UndefOr[Double] = js.native
    
    var withTheme: js.UndefOr[Boolean] = js.native
  }
  object WithWidthOptions {
    
    @scala.inline
    def apply(): WithWidthOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthOptions]
    }
    
    @scala.inline
    implicit class WithWidthOptionsMutableBuilder[Self <: WithWidthOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInitialWidth(value: Breakpoint): Self = StObject.set(x, "initialWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialWidthUndefined: Self = StObject.set(x, "initialWidth", js.undefined)
      
      @scala.inline
      def setNoSSR(value: Boolean): Self = StObject.set(x, "noSSR", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSSRUndefined: Self = StObject.set(x, "noSSR", js.undefined)
      
      @scala.inline
      def setResizeInterval(value: Double): Self = StObject.set(x, "resizeInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeIntervalUndefined: Self = StObject.set(x, "resizeInterval", js.undefined)
      
      @scala.inline
      def setWithTheme(value: Boolean): Self = StObject.set(x, "withTheme", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWithThemeUndefined: Self = StObject.set(x, "withTheme", js.undefined)
    }
  }
  
  /* Inlined parent std.Partial<@mui/material.@mui/material/Hidden/withWidth.WithWidth> */
  @js.native
  trait WithWidthProps extends StObject {
    
    var innerRef: js.UndefOr[Ref[Any]] = js.native
    
    var width: js.UndefOr[Breakpoint] = js.native
  }
  object WithWidthProps {
    
    @scala.inline
    def apply(): WithWidthProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[WithWidthProps]
    }
    
    @scala.inline
    implicit class WithWidthPropsMutableBuilder[Self <: WithWidthProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setInnerRef(value: Ref[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefFunction1(value: /* instance */ Any | Null => Unit): Self = StObject.set(x, "innerRef", js.Any.fromFunction1(value))
      
      @scala.inline
      def setInnerRefNull: Self = StObject.set(x, "innerRef", null)
      
      @scala.inline
      def setInnerRefReactRef(value: ReactRef[Any]): Self = StObject.set(x, "innerRef", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInnerRefUndefined: Self = StObject.set(x, "innerRef", js.undefined)
      
      @scala.inline
      def setWidth(value: Breakpoint): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidthUndefined: Self = StObject.set(x, "width", js.undefined)
    }
  }
}
