package in.ashwanthkumar.gocd.github;

import org.junit.Test;

import static in.ashwanthkumar.gocd.github.GHUtils.parseGithubUrl;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class GHUtilsTest {
    @Test
    public void shouldParseSSH() {
        assertThat(parseGithubUrl("git@github.com:ashwanthkumar/gocd-build-github-pull-requests.git"), is("ashwanthkumar/gocd-build-github-pull-requests"));
        assertThat(parseGithubUrl("git@github.com:ashwanthkumar/gocd-build-github-pull-requests"), is("ashwanthkumar/gocd-build-github-pull-requests"));
    }

    @Test
    public void shouldParseHTTPS() {
        assertThat(parseGithubUrl("https://github.com/ashwanthkumar/gocd-build-github-pull-requests.git"), is("ashwanthkumar/gocd-build-github-pull-requests"));
        assertThat(parseGithubUrl("https://github.com/ashwanthkumar/gocd-build-github-pull-requests"), is("ashwanthkumar/gocd-build-github-pull-requests"));
    }

    @Test
    public void shouldCheckForValidUrl() {
        assertTrue(GHUtils.isValidGHUrl("git@github.com:ashwanthkumar/gocd-build-github-pull-requests.git"));
        assertTrue(GHUtils.isValidGHUrl("https://github.com/ashwanthkumar/gocd-build-github-pull-requests.git"));
        assertTrue(GHUtils.isValidGHUrl("https://github.com/ashwanthkumar/gocd-build-github-pull-requests"));
        assertFalse(GHUtils.isValidGHUrl("http://ashwanthkumar.in/"));
    }

}
