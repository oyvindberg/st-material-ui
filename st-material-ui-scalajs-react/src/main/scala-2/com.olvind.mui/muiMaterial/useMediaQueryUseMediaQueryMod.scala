package com.olvind.mui.muiMaterial

import com.olvind.mui.muiMaterial.anon.Matches
import japgolly.scalajs.react.Callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMediaQueryUseMediaQueryMod {
  
  @JSImport("@mui/material/useMediaQuery/useMediaQuery", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def default[Theme](queryInput: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default[Theme](queryInput: String, options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  @scala.inline
  def default[Theme](queryInput: js.Function1[/* theme */ Theme, String]): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  @scala.inline
  def default[Theme](queryInput: js.Function1[/* theme */ Theme, String], options: Options): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(queryInput.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @js.native
  trait MuiMediaQueryList extends StObject {
    
    def addListener(listener: MuiMediaQueryListListener): Unit = js.native
    
    var matches: Boolean = js.native
    
    def removeListener(listener: MuiMediaQueryListListener): Unit = js.native
  }
  object MuiMediaQueryList {
    
    @scala.inline
    def apply(
      addListener: MuiMediaQueryListListener => Callback,
      matches: Boolean,
      removeListener: MuiMediaQueryListListener => Callback
    ): MuiMediaQueryList = {
      val __obj = js.Dynamic.literal(addListener = js.Any.fromFunction1((t0: MuiMediaQueryListListener) => addListener(t0).runNow()), matches = matches.asInstanceOf[js.Any], removeListener = js.Any.fromFunction1((t0: MuiMediaQueryListListener) => removeListener(t0).runNow()))
      __obj.asInstanceOf[MuiMediaQueryList]
    }
    
    @scala.inline
    implicit class MuiMediaQueryListMutableBuilder[Self <: MuiMediaQueryList] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddListener(value: MuiMediaQueryListListener => Callback): Self = StObject.set(x, "addListener", js.Any.fromFunction1((t0: MuiMediaQueryListListener) => value(t0).runNow()))
      
      @scala.inline
      def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemoveListener(value: MuiMediaQueryListListener => Callback): Self = StObject.set(x, "removeListener", js.Any.fromFunction1((t0: MuiMediaQueryListListener) => value(t0).runNow()))
    }
  }
  
  @js.native
  trait MuiMediaQueryListEvent extends StObject {
    
    var matches: Boolean = js.native
  }
  object MuiMediaQueryListEvent {
    
    @scala.inline
    def apply(matches: Boolean): MuiMediaQueryListEvent = {
      val __obj = js.Dynamic.literal(matches = matches.asInstanceOf[js.Any])
      __obj.asInstanceOf[MuiMediaQueryListEvent]
    }
    
    @scala.inline
    implicit class MuiMediaQueryListEventMutableBuilder[Self <: MuiMediaQueryListEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMatches(value: Boolean): Self = StObject.set(x, "matches", value.asInstanceOf[js.Any])
    }
  }
  
  type MuiMediaQueryListListener = js.Function1[/* event */ MuiMediaQueryListEvent, Unit]
  
  @js.native
  trait Options extends StObject {
    
    var defaultMatches: js.UndefOr[Boolean] = js.native
    
    var matchMedia: js.UndefOr[
        /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.matchMedia */ Any
      ] = js.native
    
    var noSsr: js.UndefOr[Boolean] = js.native
    
    var ssrMatchMedia: js.UndefOr[js.Function1[/* query */ String, Matches]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultMatches(value: Boolean): Self = StObject.set(x, "defaultMatches", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultMatchesUndefined: Self = StObject.set(x, "defaultMatches", js.undefined)
      
      @scala.inline
      def setMatchMedia(
        value: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof window.matchMedia */ Any
      ): Self = StObject.set(x, "matchMedia", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMatchMediaUndefined: Self = StObject.set(x, "matchMedia", js.undefined)
      
      @scala.inline
      def setNoSsr(value: Boolean): Self = StObject.set(x, "noSsr", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNoSsrUndefined: Self = StObject.set(x, "noSsr", js.undefined)
      
      @scala.inline
      def setSsrMatchMedia(value: /* query */ String => Matches): Self = StObject.set(x, "ssrMatchMedia", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSsrMatchMediaUndefined: Self = StObject.set(x, "ssrMatchMedia", js.undefined)
    }
  }
}
