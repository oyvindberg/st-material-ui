package com.olvind.mui.muiSystem

import com.olvind.mui.muiSystem.muiSystemStrings.lg
import com.olvind.mui.muiSystem.muiSystemStrings.md
import com.olvind.mui.muiSystem.muiSystemStrings.sm
import com.olvind.mui.muiSystem.muiSystemStrings.xl
import com.olvind.mui.muiSystem.muiSystemStrings.xs
import com.olvind.mui.muiTypes.mod.OverridableStringUnion
import org.scalablytyped.runtime.TopLevel
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object createBreakpointsMod {
  
  type Breakpoint = OverridableStringUnion[xs | sm | md | lg | xl, BreakpointOverrides]
  
  @js.native
  trait BreakpointOverrides extends StObject
  
  @js.native
  trait Breakpoints extends StObject {
    
    /**
      * @param start - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
      * @param end - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
      * @returns A media query string ready to be used with most styling solutions, which matches screen widths greater than
      *          the screen size given by the breakpoint key in the first argument (inclusive) and less than the screen size given by the breakpoint key in the second argument (exclusive).
      * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-between-start-end-media-query)
      */
    def between(start: Breakpoint, end: Breakpoint): String = js.native
    def between(start: Breakpoint, end: Double): String = js.native
    def between(start: Double, end: Breakpoint): String = js.native
    def between(start: Double, end: Double): String = js.native
    
    /**
      * @param key - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
      * @returns A media query string ready to be used with most styling solutions, which matches screen widths less than the screen size given by the breakpoint key (exclusive).
      * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-down-key-media-query)
      */
    def down(key: Breakpoint): String = js.native
    def down(key: Double): String = js.native
    
    var keys: js.Array[Breakpoint] = js.native
    
    /**
      * @param key - A breakpoint key (`xs`, `sm`, etc.).
      * @returns A media query string ready to be used with most styling solutions, which matches screen widths stopping at
      *          the screen size given by the breakpoint key (exclusive) and starting at the screen size given by the next breakpoint key (inclusive).
      */
    def not(key: Breakpoint): String = js.native
    
    /**
      * @param key - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
      * @returns A media query string ready to be used with most styling solutions, which matches screen widths starting from
      *          the screen size given by the breakpoint key (inclusive) and stopping at the screen size given by the next breakpoint key (exclusive).
      * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-only-key-media-query)
      */
    def only(key: Breakpoint): String = js.native
    
    /**
      * @param key - A breakpoint key (`xs`, `sm`, etc.) or a screen width number in px.
      * @returns A media query string ready to be used with most styling solutions, which matches screen widths greater than the screen size given by the breakpoint key (inclusive).
      * @see [API documentation](https://mui.com/customization/breakpoints/#theme-breakpoints-up-key-media-query)
      */
    def up(key: Breakpoint): String = js.native
    def up(key: Double): String = js.native
    
    /**
      * Each breakpoint (a key) matches with a fixed screen width (a value).
      * @default {
      *    // extra-small
      *    xs: 0,
      *    // small
      *    sm: 600,
      *    // medium
      *    md: 900,
      *    // large
      *    lg: 1200,
      *    // extra-large
      *    xl: 1536,
      * }
      */
    var values: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in @mui/system.@mui/system/createTheme/createBreakpoints.Breakpoint ]: number}
      */ com.olvind.mui.muiSystem.muiSystemStrings.Breakpoints with TopLevel[Any] = js.native
  }
  
  /* Inlined parent std.Partial<@mui/system.@mui/system/createTheme/createBreakpoints.Breakpoints> */
  @js.native
  trait BreakpointsOptions extends StObject {
    
    var between: js.UndefOr[
        js.Function2[/* start */ Breakpoint | Double, /* end */ Breakpoint | Double, String]
      ] = js.native
    
    var down: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.native
    
    var keys: js.UndefOr[js.Array[Breakpoint]] = js.native
    
    var not: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.native
    
    var only: js.UndefOr[js.Function1[/* key */ Breakpoint, String]] = js.native
    
    /**
      * The increment divided by 100 used to implement exclusive breakpoints.
      * For example, `step: 5` means that `down(500)` will result in `'(max-width: 499.95px)'`.
      * @default 5
      */
    var step: js.UndefOr[Double] = js.native
    
    /**
      * The unit used for the breakpoint's values.
      * @default 'px'
      */
    var unit: js.UndefOr[String] = js.native
    
    var up: js.UndefOr[js.Function1[/* key */ Breakpoint | Double, String]] = js.native
    
    var values: js.UndefOr[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ key in @mui/system.@mui/system/createTheme/createBreakpoints.Breakpoint ]: number}
      */ com.olvind.mui.muiSystem.muiSystemStrings.BreakpointsOptions with TopLevel[Any]
      ] = js.native
  }
  object BreakpointsOptions {
    
    @scala.inline
    def apply(): BreakpointsOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BreakpointsOptions]
    }
    
    @scala.inline
    implicit class BreakpointsOptionsMutableBuilder[Self <: BreakpointsOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBetween(value: (/* start */ Breakpoint | Double, /* end */ Breakpoint | Double) => String): Self = StObject.set(x, "between", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBetweenUndefined: Self = StObject.set(x, "between", js.undefined)
      
      @scala.inline
      def setDown(value: /* key */ Breakpoint | Double => String): Self = StObject.set(x, "down", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDownUndefined: Self = StObject.set(x, "down", js.undefined)
      
      @scala.inline
      def setKeys(value: js.Array[Breakpoint]): Self = StObject.set(x, "keys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeysUndefined: Self = StObject.set(x, "keys", js.undefined)
      
      @scala.inline
      def setKeysVarargs(value: Breakpoint*): Self = StObject.set(x, "keys", js.Array(value :_*))
      
      @scala.inline
      def setNot(value: /* key */ Breakpoint => String): Self = StObject.set(x, "not", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNotUndefined: Self = StObject.set(x, "not", js.undefined)
      
      @scala.inline
      def setOnly(value: /* key */ Breakpoint => String): Self = StObject.set(x, "only", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnlyUndefined: Self = StObject.set(x, "only", js.undefined)
      
      @scala.inline
      def setStep(value: Double): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
      
      @scala.inline
      def setUnit(value: String): Self = StObject.set(x, "unit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUnitUndefined: Self = StObject.set(x, "unit", js.undefined)
      
      @scala.inline
      def setUp(value: /* key */ Breakpoint | Double => String): Self = StObject.set(x, "up", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpUndefined: Self = StObject.set(x, "up", js.undefined)
      
      @scala.inline
      def setValues(
        value: /* import warning: importer.ImportType#apply c Unsupported type mapping: 
      {[ key in @mui/system.@mui/system/createTheme/createBreakpoints.Breakpoint ]: number}
        */ com.olvind.mui.muiSystem.muiSystemStrings.BreakpointsOptions with TopLevel[Any]
      ): Self = StObject.set(x, "values", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValuesUndefined: Self = StObject.set(x, "values", js.undefined)
    }
  }
}
